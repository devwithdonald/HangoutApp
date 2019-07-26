import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BasicUserPrivateEventsTableComponent } from './basic-user-private-events-table.component';

describe('BasicUserPrivateEventsTableComponent', () => {
  let component: BasicUserPrivateEventsTableComponent;
  let fixture: ComponentFixture<BasicUserPrivateEventsTableComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BasicUserPrivateEventsTableComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BasicUserPrivateEventsTableComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
