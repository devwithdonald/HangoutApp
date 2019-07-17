import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BasicUserPrivateEventsComponent } from './basic-user-private-events.component';

describe('BasicUserPrivateEventsComponent', () => {
  let component: BasicUserPrivateEventsComponent;
  let fixture: ComponentFixture<BasicUserPrivateEventsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BasicUserPrivateEventsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BasicUserPrivateEventsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
