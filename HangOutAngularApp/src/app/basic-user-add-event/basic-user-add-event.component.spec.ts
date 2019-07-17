import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BasicUserAddEventComponent } from './basic-user-add-event.component';

describe('BasicUserAddEventComponent', () => {
  let component: BasicUserAddEventComponent;
  let fixture: ComponentFixture<BasicUserAddEventComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BasicUserAddEventComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BasicUserAddEventComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
